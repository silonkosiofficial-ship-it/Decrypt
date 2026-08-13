.class LR7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/a;-><init>(LE8/n;Ln8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/a;


# direct methods
.method constructor <init>(LR7/a;)V
    .locals 0

    iput-object p1, p0, LR7/a$a;->C:LR7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LF8/M;
    .locals 3

    iget-object v0, p0, LR7/a$a;->C:LR7/a;

    invoke-virtual {v0}, LR7/a;->M0()Ly8/h;

    move-result-object v1

    new-instance v2, LR7/a$a$a;

    invoke-direct {v2, p0}, LR7/a$a$a;-><init>(LR7/a$a;)V

    invoke-static {v0, v1, v2}, LF8/q0;->v(LO7/h;Ly8/h;Lx7/l;)LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/a$a;->a()LF8/M;

    move-result-object v0

    return-object v0
.end method
