.class Ls5/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls5/g;->p(Ls5/e;Ll5/f;)Ll4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll5/f;

.field final synthetic b:Ls5/g;


# direct methods
.method constructor <init>(Ls5/g;Ll5/f;)V
    .locals 0

    iput-object p1, p0, Ls5/g$a;->b:Ls5/g;

    iput-object p2, p0, Ls5/g$a;->a:Ll5/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ls5/g$a;)Lorg/json/JSONObject;
    .locals 0

    invoke-direct {p0}, Ls5/g$a;->c()Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private synthetic c()Lorg/json/JSONObject;
    .locals 3

    iget-object v0, p0, Ls5/g$a;->b:Ls5/g;

    invoke-static {v0}, Ls5/g;->j(Ls5/g;)Ls5/l;

    move-result-object v0

    iget-object v1, p0, Ls5/g$a;->b:Ls5/g;

    invoke-static {v1}, Ls5/g;->f(Ls5/g;)Ls5/k;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ls5/l;->a(Ls5/k;Z)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ll4/l;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ls5/g$a;->d(Ljava/lang/Void;)Ll4/l;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Void;)Ll4/l;
    .locals 4

    .prologue
    iget-object p1, p0, Ls5/g$a;->a:Ll5/f;

    iget-object p1, p1, Ll5/f;->d:Ll5/e;

    invoke-virtual {p1}, Ll5/e;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Ls5/f;

    invoke-direct {v0, p0}, Ls5/f;-><init>(Ls5/g$a;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ls5/g$a;->b:Ls5/g;

    invoke-static {v0}, Ls5/g;->c(Ls5/g;)Ls5/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls5/h;->b(Lorg/json/JSONObject;)Ls5/d;

    move-result-object v0

    iget-object v1, p0, Ls5/g$a;->b:Ls5/g;

    invoke-static {v1}, Ls5/g;->d(Ls5/g;)Ls5/a;

    move-result-object v1

    iget-wide v2, v0, Ls5/d;->c:J

    invoke-virtual {v1, v2, v3, p1}, Ls5/a;->c(JLorg/json/JSONObject;)V

    iget-object v1, p0, Ls5/g$a;->b:Ls5/g;

    const-string v2, "Loaded settings: "

    invoke-static {v1, p1, v2}, Ls5/g;->e(Ls5/g;Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object p1, p0, Ls5/g$a;->b:Ls5/g;

    invoke-static {p1}, Ls5/g;->f(Ls5/g;)Ls5/k;

    move-result-object v1

    iget-object v1, v1, Ls5/k;->f:Ljava/lang/String;

    invoke-static {p1, v1}, Ls5/g;->g(Ls5/g;Ljava/lang/String;)Z

    iget-object p1, p0, Ls5/g$a;->b:Ls5/g;

    invoke-static {p1}, Ls5/g;->h(Ls5/g;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Ls5/g$a;->b:Ls5/g;

    invoke-static {p1}, Ls5/g;->i(Ls5/g;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll4/m;

    invoke-virtual {p1, v0}, Ll4/m;->e(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Ll4/o;->e(Ljava/lang/Object;)Ll4/l;

    move-result-object p1

    return-object p1
.end method
