<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="../include/header.jsp" %>

<!-- Main Content -->

<section class="content">
<div class="row">
<!-- left column -->
<div class="col-md-12">
<!-- general form elements -->
<div class="box box-primary">
<div class="box-header">
<h3 class="box-title">REGISTER POST</h3>
</div>
<!--  /.box-header -->

<form role="form" method="post">
<div class="box-body">
<div class="form-group">
<label for="exampleInputEmail1">TITLE</label><input type="text" 
name='postTitle' class="form-control" placeholder="Enter Title">
</div>
<div class="form-group">
<label for="exampleInputPassword1">CONTENT</label>
<textarea class="form-control" name="postContent" rows="3"
placeholder="Enter..."></textarea>
</div>
<div class="form-group">
<label for="exampleInputEmail1">WRITER</label> <input type="text" 
name="userId" class="form-control" value='${login.userId}' readonly>
</div>
<input type='hidden' name="repGroup" class="form-control" value='${postVO.postId}'>
</div>
<!-- /.box-body -->

<div class="box-footer">
<button type="submit" class="btn btn-primary">SUBMIT</button>
</div>
</form>

</div>
<!-- /.box -->
</div>
<!-- /.col (left) -->

</div>
<!-- /.row -->

</section>
<!-- /.content -->
</div>
<!-- Content-wrapper -->

<%@include file="../include/footer.jsp"%>