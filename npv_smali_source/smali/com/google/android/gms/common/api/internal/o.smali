.class final Lcom/google/android/gms/common/api/internal/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LP3/b;

.field private final b:LN3/d;


# direct methods
.method synthetic constructor <init>(LP3/b;LN3/d;LP3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/o;->a:LP3/b;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/o;->b:LN3/d;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/common/api/internal/o;)LN3/d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/o;->b:LN3/d;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/common/api/internal/o;)LP3/b;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/o;->a:LP3/b;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/google/android/gms/common/api/internal/o;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/common/api/internal/o;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->a:LP3/b;

    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/o;->a:LP3/b;

    invoke-static {v1, v2}, LQ3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->b:LN3/d;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/o;->b:LN3/d;

    invoke-static {v1, p1}, LQ3/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/o;->a:LP3/b;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/o;->b:LN3/d;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, LQ3/n;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, LQ3/n;->c(Ljava/lang/Object;)LQ3/n$a;

    move-result-object v0

    const-string v1, "key"

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/o;->a:LP3/b;

    invoke-virtual {v0, v1, v2}, LQ3/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)LQ3/n$a;

    move-result-object v0

    const-string v1, "feature"

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/o;->b:LN3/d;

    invoke-virtual {v0, v1, v2}, LQ3/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)LQ3/n$a;

    move-result-object v0

    invoke-virtual {v0}, LQ3/n$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
