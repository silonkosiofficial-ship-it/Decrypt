.class LE8/f$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/f$e;-><init>(LE8/f;Ljava/util/concurrent/ConcurrentMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LE8/f$g;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, LE8/f$g;->a(LE8/f$g;)Lx7/a;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE8/f$g;

    invoke-virtual {p0, p1}, LE8/f$e$a;->a(LE8/f$g;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
