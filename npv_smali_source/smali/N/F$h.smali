.class final LN/F$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/F;->l0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/F;


# direct methods
.method constructor <init>(LN/F;)V
    .locals 0

    iput-object p1, p0, LN/F$h;->D:LN/F;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LN/F$h;->D:LN/F;

    invoke-virtual {v0}, LN/F;->U()V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/F$h;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
