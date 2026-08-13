.class final Lr2/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr2/b;-><init>(Lr2/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lr2/b;


# direct methods
.method constructor <init>(Lr2/b;)V
    .locals 0

    iput-object p1, p0, Lr2/b$a;->D:Lr2/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lr2/d;
    .locals 3

    .prologue
    iget-object v0, p0, Lr2/b$a;->D:Lr2/b;

    invoke-virtual {v0}, Lr2/b;->c()Lr2/c;

    move-result-object v0

    invoke-virtual {v0}, Lr2/c;->b()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->getDatabaseName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ":memory:"

    :cond_0
    new-instance v1, Lr2/d;

    iget-object v2, p0, Lr2/b$a;->D:Lr2/b;

    invoke-virtual {v2}, Lr2/b;->c()Lr2/c;

    move-result-object v2

    invoke-virtual {v2, v0}, Lr2/c;->c(Ljava/lang/String;)Lr2/a;

    move-result-object v0

    invoke-direct {v1, v0}, Lr2/d;-><init>(Lr2/a;)V

    return-object v1
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr2/b$a;->a()Lr2/d;

    move-result-object v0

    return-object v0
.end method
