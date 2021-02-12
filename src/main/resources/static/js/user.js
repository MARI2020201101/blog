let register=
{   init:function() {
    $("#btn-save").on("click", () => {
        this.save();
    });
},
    save:function (){
        let data = {
            username:$("#username").val(),
            password:$("#password").val()
        }

        $ajax({
            method: 'post',
            url: '/blog/user/register',
            data:JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType : 'json'
            }
        ).done(function(){

        }).fail(function (){

        });
    }

}
register.init();