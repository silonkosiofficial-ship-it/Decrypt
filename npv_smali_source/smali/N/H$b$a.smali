.class final LN/H$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/H$b;->f(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN/F;

.field final synthetic E:LV/w0;


# direct methods
.method constructor <init>(LN/F;LV/w0;)V
    .locals 0

    iput-object p1, p0, LN/H$b$a;->D:LN/F;

    iput-object p2, p0, LN/H$b$a;->E:LV/w0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    iget-object v0, p0, LN/H$b$a;->D:LN/F;

    iget-object v1, p0, LN/H$b$a;->E:LV/w0;

    invoke-static {v1}, LN/H$b;->a(LV/w0;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LN/G;->b(LN/F;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LN/H$b$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    return-object v0
.end method
