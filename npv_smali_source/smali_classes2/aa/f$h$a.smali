.class final Laa/f$h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/f$h;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LY0/e;


# direct methods
.method constructor <init>(LY0/e;)V
    .locals 0

    iput-object p1, p0, Laa/f$h$a;->D:LY0/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)Laa/e;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laa/e$b;

    invoke-static {p1}, Laa/g;->b([B)Laa/B;

    const/4 p1, 0x0

    iget-object v1, p0, Laa/f$h$a;->D:LY0/e;

    invoke-static {p1, v1}, Laa/g;->c(Laa/B;LY0/e;)Lt0/b;

    move-result-object p1

    invoke-direct {v0, p1}, Laa/e$b;-><init>(Lt0/b;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Laa/f$h$a;->a([B)Laa/e;

    move-result-object p1

    return-object p1
.end method
