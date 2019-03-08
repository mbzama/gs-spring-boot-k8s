To access dashboard:
	minikube dashboard

To access dashboard:
	http://127.0.0.1:37165/api/v1/namespaces/kube-system/services/http:kubernetes-dashboard:/proxy/#!/workload?namespace=default

Install ingress (Load Balancer):
	minikube addons enable ingress

Create pods with YAML:
kubectl create -f deployent.yml
	pod/spring-boot-k8s created
		
Create pods with command
	kubectl run --generator=run-pod/v1 gs-spring-boot-k8s --image=zamamb/gs-spring-boot-docker --port=8001
	kubectl expose deployment gs-spring-boot-k8s --type="NodePort"

To get IP Address of the service:
	$(minikube service gs-spring-boot-k8s --url)

To access the API/Service:
	curl $(minikube service gs-spring-boot-k8s --url)/version
