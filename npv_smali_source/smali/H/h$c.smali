.class final LH/h$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;LM0/P;LS0/g0;Lx7/l;Lz/l;Lo0/n0;ZIILS0/s;LH/u;ZZLx7/q;LV/n;III)V
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

    iput-object p1, p0, LH/h$c;->D:LN/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 1

    iget-object p1, p0, LH/h$c;->D:LN/F;

    new-instance v0, LH/h$c$a;

    invoke-direct {v0, p1}, LH/h$c$a;-><init>(LN/F;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LH/h$c;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
