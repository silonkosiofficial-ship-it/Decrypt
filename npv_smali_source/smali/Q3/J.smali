.class final LQ3/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO3/g$a;


# instance fields
.field final synthetic a:LO3/g;

.field final synthetic b:Ll4/m;

.field final synthetic c:LQ3/o$a;

.field final synthetic d:LQ3/L;


# direct methods
.method constructor <init>(LO3/g;Ll4/m;LQ3/o$a;LQ3/L;)V
    .locals 0

    iput-object p1, p0, LQ3/J;->a:LO3/g;

    iput-object p2, p0, LQ3/J;->b:Ll4/m;

    iput-object p3, p0, LQ3/J;->c:LQ3/o$a;

    iput-object p4, p0, LQ3/J;->d:LQ3/L;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    .prologue
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LQ3/J;->a:LO3/g;

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, LO3/g;->b(JLjava/util/concurrent/TimeUnit;)LO3/k;

    move-result-object p1

    iget-object v0, p0, LQ3/J;->b:Ll4/m;

    iget-object v1, p0, LQ3/J;->c:LQ3/o$a;

    invoke-interface {v1, p1}, LQ3/o$a;->a(LO3/k;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll4/m;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, LQ3/J;->b:Ll4/m;

    invoke-static {p1}, LQ3/b;->a(Lcom/google/android/gms/common/api/Status;)LO3/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll4/m;->b(Ljava/lang/Exception;)V

    return-void
.end method
