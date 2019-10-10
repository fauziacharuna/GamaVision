<?php include "admin/class.php";
$data = $link->query("SELECT * from info where id=1")->fetch_assoc();
$slider = $link->query("SELECT * from slider order by id_slider asc");
$service = $link->query("SELECT * from services order by id_service asc");
$why = $link->query("SELECT * from why order by id_why asc");
$client = $link->query("SELECT * from clients order by id_client asc");
 ?>
<!DOCTYPE html>
<html>
<head>
	<title><?= $data['title'] ?> - <?= $data['slogan'] ?></title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Security-Policy" content="default-src *; script-src 'self' 'unsafe-inline' 'unsafe-eval' *; style-src 'self' 'unsafe-inline' *; img-src * data: 'unsafe-inline'">
	<style type="text/css">
		.slider ul li{
			width: <?= 100/mysqli_num_rows($slider) ?>%;
		}
		.slider ul{
			width:<?= mysqli_num_rows($slider) ?>00%;
		}
	</style>
</head>
<body>
<div class="container tops">
	<div class="row">
		<div class="col-4">
			<a href="#"><img src="images/textlogo.png" alt="Logo"></a>
		</div>
		<div class="col-4">
			<a href="#"><img src="images/toplogo.png" alt="Logo"></a>
		</div>
	</div>
</div>
<div class="row">
	<div class="slider col-12">
		<ul>
<?php
while($datas = $slider->fetch_assoc()){
?>
			<li><img src="images/sliders/<?= $datas['picture'] ?>" alt="slider">
				<div class="tek" <?= ($datas['color']==1) ? 'style="color:#000"' : 'style="color:#fff"' ?>>
					<h2><?= $datas['title'] ?></h2>
					<p><?= $datas['description'] ?></p>
				</div>
			</li>
<?php } ?>
		</ul>
		<div class="text">
			<img src="images/down.png" alt="down" onclick="moveDown();">
		</div>
	 </div>
</div>
<div class="container about">
	<div class="row">
		<div class="col-12">
			<h2>About <?= $data['title'] ?></h2>
		</div>
	</div>
	<div class="row">
		<div class="col-4 right">
			<img src="images/about.png" alt="About">
		</div>
		<div class="col-8 justify">
			<?= $data['about'] ?>
		</div>
	</div>
</div>
<div class="container service">
	<div class="row">
		<div class="col-12">
			<h2>Services</h2>
		</div>
	</div>
	<div class="row">
<?php
$c = 1;
while($datas = $service->fetch_assoc()){
?>
		<div class="col-4">
			<div class="row">
				<div class="col-12">
					<center>
						<div class="img">
							<img src="images/services/<?= $datas['pict'] ?>" alt="Service" class="bottom">
							<img src="images/services/<?= $datas['pict_hover'] ?>" alt="Service" class="top">
						</div>
					</center>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<center><h4><?= $datas['title'] ?></h4></center>
				</div>
			</div>
			<div class="row">
				<div class="col-12 justifiy">
					<p><?= $datas['description'] ?></p>
				</div>
			</div>
		</div>
<?php if($c%3==0 && $c!=mysqli_num_rows($service)) echo '</div><br /><br />
	<div class="row">'; $c++; ?>
<?php } ?>
	</div>
</div>
<div class="container why">
	<div class="row">
		<div class="col-12">
			<h2>Why Us?</h2>
		</div>
	</div>
	<div class="row">
<?php
$c = 1;
while($datas = $why->fetch_assoc()){
?>
		<div class="col-4">
			<div class="row">
				<div class="col-12">
					<center><div class="img">
						    <img class="bottom" src="images/why/<?= $datas['pict'] ?>" alt="Why">
						    <img class="top" src="images/why/<?= $datas['pict_hover'] ?>" alt="Why">
						</div>
					</center>
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<center><h4><?= $datas['title'] ?></h4></center>
				</div>
			</div>
			<div class="row">
				<div class="col-12 justifiy">
					<p><?= $datas['description'] ?></p>
				</div>
			</div>
		</div>
<?php if($c%3==0 && $c!=mysqli_num_rows($why)) echo '</div><br /><br />
	<div class="row">'; $c++; ?>
<?php } ?>
	</div>
</div>
<div class="container clients">
	<div class="row">
		<div class="col-12 center">
			<h2>Our Clients</h2>
		</div>
	</div>
	<div class="row">
		<div class="col-1 center">
			<img src="images/clientshow.png" alt="Clients" id="buttonPrev" style="cursor: pointer;" onclick="prev();">
		</div>
		<div class="col-10 myslide">
			<div id="clients">
		        <div class="clients-wrap">
		          <ul id="clients-list" class="clearfix">
		          	<?php
$c = 1;
while($datas = $client->fetch_assoc()){
?>
		            <li><a href="<?= $datas['link'] ?>" target="_blank"><img src="images/clients/<?= $datas['pict'] ?>" alt="<?= $datas['title'] ?>"></a></li>
<?php } ?>
		          </ul>
		        </div>
			</div>

		</div>
		<div class="col-1 center">
			<img src="images/clienthide.png" alt="Clients" id="buttonNext" style="cursor: pointer;" onclick="next();">
		</div>
	</div>
</div>
<div class="container info">
	<div class="row">
		<div class="col-3">
			<img src="images/bottomlogo.png">
		</div>
	</div>
	<div class="row">
		<div class="col-2">&ensp;</div>
		<div class="col-4">
			<div class="box">
			    <img src="images/place.png">&ensp;&ensp;
			    <span><?= $data['pt_name'] ?><br />
			    </span>
			</div>
			<div class="box">
			    <img src="images/place.png" style="visibility: hidden;">&ensp;&ensp;
			    <span class="addr"><br /><?= $data['pt_address'] ?><br />
			    </span>
			</div>
		</div>
		<div class="col-3">
				<div class="box">
				    <img src="images/whatsapp.png">&ensp;
				    <span><a href="https://wa.me/<?= $data['whatsapp'] ?>">+ <?= $data['whatsapp'] ?></a></span>
				</div>
		</div>
		<div class="col-3">
			<div class="box">
			    <img src="images/email.png">&ensp;
			    <span><a href="mailto:<?= $data['email'] ?>"><?= $data['email'] ?></a></span>
			</div>
		</div>
	</div>
</div>
<div class="map">
	<iframe width="100%" height="300" src="https://maps.google.com/maps?width=100%&height=300&hl=id&q=<?= $data['maps'] ?>&ie=UTF8&t=&z=16&iwloc=B&output=embed" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" title="<?= $data['maps'] ?>"></iframe>
</div>
<div class="container footer">
	<div class="row">
		<div class="col-4">
			<p><?= date('Y') ?> <span id="c">&copy;</span> <?= $data['title'] ?></p>
		</div>
		<div class="col-4">
			<img src="images/footerup.png" alt="Up" onclick="moveUp();">
		</div>
	</div>
</div>
<script type="text/javascript">
	var jml = <?= mysqli_num_rows($slider) ?>;
</script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</body>
</html>