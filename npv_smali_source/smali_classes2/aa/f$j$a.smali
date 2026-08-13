.class final Laa/f$j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/f$j;->B(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Laa/f$j$a;->D:LY0/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)Laa/e;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laa/e$c;

    invoke-static {p1}, Laa/h;->a([B)Lda/a;

    move-result-object p1

    iget-object v1, p0, Laa/f$j$a;->D:LY0/e;

    invoke-static {p1, v1}, Lca/c;->q(Lda/a;LY0/e;)Lu0/d;

    move-result-object p1

    invoke-direct {v0, p1}, Laa/e$c;-><init>(Lu0/d;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Laa/f$j$a;->a([B)Laa/e;

    move-result-object p1

    return-object p1
.end method
