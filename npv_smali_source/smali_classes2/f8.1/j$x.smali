.class final Lf8/j$x;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf8/j$x;->D:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf8/m$a$a;)V
    .locals 4

    const-string v0, "$this$function"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/j$x;->D:Ljava/lang/String;

    invoke-static {}, Lf8/j;->a()Lf8/e;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Lf8/e;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {p1, v0, v2}, Lf8/m$a$a;->c(Ljava/lang/String;[Lf8/e;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf8/m$a$a;

    invoke-virtual {p0, p1}, Lf8/j$x;->a(Lf8/m$a$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
