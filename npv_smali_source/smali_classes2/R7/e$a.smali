.class LR7/e$a;
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
.field final synthetic C:LE8/n;

.field final synthetic D:LO7/d0;

.field final synthetic E:LR7/e;


# direct methods
.method constructor <init>(LR7/e;LE8/n;LO7/d0;)V
    .locals 0

    iput-object p1, p0, LR7/e$a;->E:LR7/e;

    iput-object p2, p0, LR7/e$a;->C:LE8/n;

    iput-object p3, p0, LR7/e$a;->D:LO7/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LF8/e0;
    .locals 4

    new-instance v0, LR7/e$c;

    iget-object v1, p0, LR7/e$a;->E:LR7/e;

    iget-object v2, p0, LR7/e$a;->C:LE8/n;

    iget-object v3, p0, LR7/e$a;->D:LO7/d0;

    invoke-direct {v0, v1, v2, v3}, LR7/e$c;-><init>(LR7/e;LE8/n;LO7/d0;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/e$a;->a()LF8/e0;

    move-result-object v0

    return-object v0
.end method
