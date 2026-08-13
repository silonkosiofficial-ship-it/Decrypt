.class public abstract LP3/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ll4/m;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Ll4/m;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {p0}, LQ3/b;->a(Lcom/google/android/gms/common/api/Status;)LO3/b;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll4/m;->b(Ljava/lang/Exception;)V

    return-void
.end method
