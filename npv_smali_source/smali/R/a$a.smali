.class final LR/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR/a;-><init>(ZFLV/G1;LV/G1;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR/a;


# direct methods
.method constructor <init>(LR/a;)V
    .locals 0

    iput-object p1, p0, LR/a$a;->D:LR/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LR/a$a;->D:LR/a;

    invoke-static {v0}, LR/a;->i(LR/a;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, LR/a;->j(LR/a;Z)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LR/a$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
