function getEventData() {
    var event = document.getElementById("eventName").value;
    var responseData = document.getElementById("responseData");
    $.ajax({
        url: "/eventData",
        type: "post",
        data: {
            event: event
        },
        success: function (response) {

            responseData.innerHTML=response;
        },
        error: function () {
            window.alert("unknown error")
        }
    });
}
function check() {
    if(document.getElementById("category").value!=="спортивный разряд"){
     document.getElementById("kind").innerHTML='' +
         '                            <div class="form-group">'+
         '<select name="category" id="category" onblur="check()">'+
            '<option>вид спорта</option>'+
         '<option>Автоспорт</option>'+
         '<option>Академическая гребля</option>'+
         '<option>Альпинизм</option>'+
         '<option>Американский футбол</option>'+
         '<option>Бадминтон</option>'+
         '<option>Баскетбол</option>'+
         '<option>Биатлон</option>'+
         '<option>Бильярд</option>'+
         '<option>Бобслей</option>'+
         '<option>Боевые искусства</option>'+
         '<option>Бокс</option>'+
         '<option>Борьба</option>'+
         '<option>Велоспорт</option>'+
         '<option>Водное поло</option>'+
         '<option>Водные лыжи</option>'+
         '<option>Водный туризм</option>'+
         '<option>Волейбол</option>'+
         '<option>Гандбол</option>'+
         '<option>Гимнастика</option>'+
         '<option>Гиревой спорт</option>'+
         '<option>Гольф</option>'+
         '<option>Горнолыжный спорт</option>'+
         '<option>Дзюдо</option>'+
         '<option>Каратэ</option>'+
         '<option>Кёрлинг</option>'+
         '<option>Киберспорт</option>'+
         '<option>Кикбоксинг</option>'+
         '<option>Конный спорт</option>'+
         '<option>Конькобежный спорт</option>'+
         '<option>Кудо</option>'+
         '<option>Лёгкая атлетика</option>'+
         '<option>Лыжный спорт</option>'+
         '<option>Международные шашки</option>'+
         '<option>Мини-футбол</option>'+
         '<option>Мотоспорт</option>'+
         '<option>Настольный теннис</option>'+
         '<option>Парусный спорт</option>'+
         '<option>Пауэрлифтинг</option>'+
         '<option>Плавание</option>'+
         '<option>Пляжный футбол</option>'+
         '<option>Прыжки в воду</option>'+
         '<option>Прыжки с трамплина</option>'+
         '<option>Радиоспорт</option>'+
         '<option>Регби</option>'+
         '<option>Регбилиг</option>'+
         '<option>Самбо</option>'+
         '<option>Санный спорт</option>'+
         '<option>Скелетон</option>'+
         '<option>Следж-хоккей</option>'+
         '<option>Сноуборд</option>'+
         '<option>Снукер</option>'+
         '<option>Софтбол</option>'+
         '<option>Спидвей</option>'+
         '<option>Стрелковый спорт</option>'+
         '<option>Стрельба из лука</option>'+
         '<option>Теннис</option>'+
         '<option>Тяжёлая атлетика</option>'+
         '<option>Фехтование</option>'+
         '<option>Фигурное катание</option>'+
         '<option>Футбол в залах</option>'+
         '<option>Футбол</option>'+
         '<option>Хоккей</option>'+
         '<option>Хоккей на траве</option>'+
         '<option>Хоккей с мячом</option>'+
         '<option>Шахматы</option>'+
         '<option>Шашки</option>'+
         '<option>Шорт-трек</option>'+
        '</select>'+
        '</div>';
    }
}