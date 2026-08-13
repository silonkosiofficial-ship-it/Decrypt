.class public final LN/H$a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H$a;->a(Lw/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic D:Lw/i;

.field final synthetic E:LN/F;


# direct methods
.method public constructor <init>(Lw/i;LN/F;)V
    .locals 0

    iput-object p1, p0, LN/H$a$c;->D:Lw/i;

    iput-object p2, p0, LN/H$a$c;->E:LN/F;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LN/H$a$c;->E:LN/F;

    invoke-virtual {v0}, LN/F;->T()V

    iget-object v0, p0, LN/H$a$c;->D:Lw/i;

    invoke-static {v0}, Lw/j;->a(Lw/i;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/H$a$c;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
