.class final LI7/t$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/t$a;-><init>(LI7/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/t;


# direct methods
.method constructor <init>(LI7/t;)V
    .locals 0

    iput-object p1, p0, LI7/t$a$a;->D:LI7/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LT7/f;
    .locals 2

    sget-object v0, LT7/f;->c:LT7/f$a;

    iget-object v1, p0, LI7/t$a$a;->D:LI7/t;

    invoke-virtual {v1}, LI7/t;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LT7/f$a;->a(Ljava/lang/Class;)LT7/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/t$a$a;->a()LT7/f;

    move-result-object v0

    return-object v0
.end method
