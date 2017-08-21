
    $(document).on('click', '.clickable', function(event) {
      event.preventDefault(); // To prevent following the link (optional)
    $(this).toggleClass("highlight");

       console.log("Capturing click event.");
    });