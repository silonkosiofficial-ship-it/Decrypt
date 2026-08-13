.class final LR7/L$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/L$b;->g0(LO7/a;Ln8/f;I)LO7/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/L$b;


# direct methods
.method constructor <init>(LR7/L$b;)V
    .locals 0

    iput-object p1, p0, LR7/L$b$a;->D:LR7/L$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LR7/L$b$a;->D:LR7/L$b;

    invoke-virtual {v0}, LR7/L$b;->W0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR7/L$b$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
