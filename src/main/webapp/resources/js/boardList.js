/**
 * 
 */

$(document).ready(function(){        
        boardList();
    });
 
    /* 게시물 목록 조회  */
    function boardList(){
        
        $.ajax({            
            type:"POST",
            url:"listAction",
            dataType:"JSON",
            success : function(obj) {
                boardListCallback(obj);                
            },           
            error : function(xhr, status, error) {}
         });
    }
    /* 게시판 - 목록 조회  콜백 함수 */
    function boardListCallback(obj){
        
        var list = obj;
        var listLen = obj.length;
        
        console.log(list);
        console.log(listLen);
        
        var str = "";
        
        if(listLen >  0){
            
            for(var a=0; a<listLen; a++){
                
                var boardSeq        = list[a].board_SEQ; 
                var boardReRef         = list[a].board_RE_REF; 
                var boardReLev         = list[a].board_RE_LEV; 
                var boardReSeq         = list[a].board_RE_SEQ; 
                var boardWriter     = list[a].board_WRITER; 
                var boardSubject     = list[a].board_SUBJECT; 
                var boardContent     = list[a].board_CONTENT; 
                var boardHits         = list[a].board_HITS;
                var delYn             = list[a].del_YN; 
                var insUserId         = list[a].ins_USER_ID;
                var insDate         = list[a].ins_DATE; 
                var updUserId         = list[a].upd_USER_ID;
                var updDate         = list[a].upd_DATE;

               str += "<tr>";
                str += "<td>"+ boardSeq +"</td>";
                str += "<td>"+ boardSubject +"</td>";
                str += "<td>"+ boardHits +"</td>";
                str += "<td>"+ boardWriter +"</td>";    
                str += "<td>"+ insDate +"</td>";    
                str += "</tr>";
                
            } 
            
        } else {
            
            str += "<tr>";
            str += "<td colspan='5'>등록된 글이 존재하지 않습니다.</td>";
            str += "<tr>";
        }
        
        $("#tbody").html(str);
    }