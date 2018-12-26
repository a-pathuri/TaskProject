import $ from "jquery";


export function getJson(url, data) {
    return $.ajax({
      dataType: "json",
      url: url,
      data: data,
      success: function(data) {
        return data;
      }
    });
  }
  export function postIt(url, data) {
    return $.ajax({
      method: "POST",
      url: url,
      data: data,
      success: function(data) {
        return data;
      }
    });
  }