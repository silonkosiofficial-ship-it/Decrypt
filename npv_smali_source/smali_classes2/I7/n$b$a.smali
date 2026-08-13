.class final LI7/n$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/n$b;-><init>(LI7/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/n;


# direct methods
.method constructor <init>(LI7/n;)V
    .locals 0

    iput-object p1, p0, LI7/n$b$a;->D:LI7/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LT7/k;
    .locals 1

    iget-object v0, p0, LI7/n$b$a;->D:LI7/n;

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LI7/E;->a(Ljava/lang/Class;)LT7/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/n$b$a;->a()LT7/k;

    move-result-object v0

    return-object v0
.end method
