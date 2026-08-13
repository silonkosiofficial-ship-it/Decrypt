.class LR7/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/e;-><init>(LE8/n;LO7/m;LP7/g;Ln8/f;LF8/u0;ZILO7/a0;LO7/d0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Ln8/f;

.field final synthetic D:LR7/e;


# direct methods
.method constructor <init>(LR7/e;Ln8/f;)V
    .locals 0

    iput-object p1, p0, LR7/e$b;->D:LR7/e;

    iput-object p2, p0, LR7/e$b;->C:Ln8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LF8/M;
    .locals 5

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0}, LF8/a0$a;->i()LF8/a0;

    move-result-object v0

    iget-object v1, p0, LR7/e$b;->D:LR7/e;

    invoke-virtual {v1}, LR7/e;->p()LF8/e0;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    new-instance v3, Ly8/g;

    new-instance v4, LR7/e$b$a;

    invoke-direct {v4, p0}, LR7/e$b$a;-><init>(LR7/e$b;)V

    invoke-direct {v3, v4}, Ly8/g;-><init>(Lx7/a;)V

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, LF8/F;->m(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;)LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/e$b;->a()LF8/M;

    move-result-object v0

    return-object v0
.end method
