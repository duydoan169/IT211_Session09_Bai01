- System.out.println() chỉ in ra console, không lưu lại file hay database,
nên khi server khởi động lại là mất hết, không truy vết được lỗi.
- Không có cấp độ log (INFO, WARN, ERROR), nên không biết cái nào quan trọng,
khó lọc và theo dõi khi có sự cố.
- Trên Production, console output thường bị bỏ qua hoặc không ai đọc,
trong khi các hệ thống log tập trung (Logstash, Grafana...) cần định dạng chuẩn để thu thập được.