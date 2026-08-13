.class final La4/o;
.super La4/e;
.source "SourceFile"


# instance fields
.field final synthetic C:Ll4/m;


# direct methods
.method constructor <init>(La4/p;Ll4/m;)V
    .locals 0

    iput-object p2, p0, La4/o;->C:Ll4/m;

    invoke-direct {p0}, La4/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final x5(Lcom/google/android/gms/common/api/Status;LH3/f;)V
    .locals 2

    .prologue
    if-eqz p2, :cond_0

    new-instance v0, LH3/c;

    invoke-virtual {p2}, LH3/f;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, LH3/f;->e()I

    move-result p2

    invoke-direct {v0, v1, p2}, LH3/c;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object p2, p0, La4/o;->C:Ll4/m;

    invoke-static {p1, v0, p2}, LP3/m;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ll4/m;)V

    return-void
.end method
