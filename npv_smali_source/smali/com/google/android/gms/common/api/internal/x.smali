.class public final Lcom/google/android/gms/common/api/internal/x;
.super Lcom/google/android/gms/common/api/internal/u;
.source "SourceFile"


# direct methods
.method public constructor <init>(LP3/f;Ll4/m;)V
    .locals 0

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/api/internal/u;-><init>(ILl4/m;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lcom/google/android/gms/common/api/internal/g;Z)V
    .locals 0

    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/internal/n;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/n;->u()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final g(Lcom/google/android/gms/common/api/internal/n;)[LN3/d;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/n;->u()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final h(Lcom/google/android/gms/common/api/internal/n;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/n;->u()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/u;->b:Ll4/m;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ll4/m;->e(Ljava/lang/Object;)Z

    return-void
.end method
