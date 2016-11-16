<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Register User list 
        <small>advanced tables</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">Tables</a></li>
        <li class="active">Data tables</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Hover Data Table</h3>
              <div class="col-xs-2"  style="float:right;"> <button type="button" class="btn btn-block btn-danger btn-flat" data-toggle="modal" data-target="#myModal">Create User</button>
            </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table id="example2" class="table table-bordered table-hover">
                <thead>
                <tr>
                  <th>S.No</th>
                  <th>Full name</th>
                  <th>Email </th>
                  <th>Phone Number</th>
                  <th>Password</th>
                  <th>Satues</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                  <td>1</td>
                  <td>vijaykumar</td>
                  <td>ss@gmail.com</td>
                  <td>456456121</td>
                  <td>dfg</td>
                  <td><div class="btn-group">
                      <button type="button" class="btn btn-success">1</button>
                      <button type="button" class="btn btn-success">2</button>
                      <button type="button" class="btn btn-success">3</button>
                      <button type="button" class="btn btn-success">4</button>
                     </div> 
                      </td>
                </tr>
                <tr>
                  <td>1</td>
                  <td>vijaykumar</td>
                  <td>ss@gmail.com</td>
                  <td>456456121</td>
                  <td>dfg</td>
                  <td><div class="btn-group">
                      <button type="button" class="btn btn-success">1</button>
                      <button type="button" class="btn btn-success">2</button>
                      <button type="button" class="btn btn-success">4</button>
                     </div></td>
                </tr>
                <tr>
                  <td>1</td>
                  <td>vijaykumar</td>
                  <td>ss@gmail.com</td>
                  <td>456456121</td>
                  <td>dfg</td>
                  <td><div class="btn-group">
                      <button type="button" class="btn btn-success">1</button>
                      <button type="button" class="btn btn-success">2</button>
                      <button type="button" class="btn btn-success">3</button>
                      <button type="button" class="btn btn-success">4</button>
                     </div></td>
                </tr>
                </tbody>
                <tfoot>
                <tr>
                  <th>S.no</th>
                  <th>Fullname</th>
                  <th>Email are User Name </th>
                  <th>Engine version</th>
                  <th>CSS grade</th>
                  <th>button</th>
                </tr>
                </tfoot>
              </table>
            </div>
            <!-- /.box-body -->
              <div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">User Create </h4>
              </div>
              <div class="modal-body">
                
                 <form action="dashboard.html" method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="Full name">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="Phone" class="form-control" placeholder="Phone">
        <span class="glyphicon glyphicon-earphone form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="email" class="form-control" placeholder="Email">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="Password">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="Retype password">
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
    
    </form>
                
                
                
                
              </div>
               <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-default">Save changes</button>
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
</div>
          </div>
          <!-- /.box -->

            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>