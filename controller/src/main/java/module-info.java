module library.controller.main {
    requires library.models.main;
    requires com.google.gson;
    requires static lombok;
    exports vk.course.controller;
}