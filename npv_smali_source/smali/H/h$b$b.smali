.class final LH/h$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/h$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LH/w;

.field final synthetic D:LS0/X;

.field final synthetic E:LN/F;

.field final synthetic F:LS0/s;


# direct methods
.method constructor <init>(LH/w;LS0/X;LN/F;LS0/s;)V
    .locals 0

    iput-object p1, p0, LH/h$b$b;->C:LH/w;

    iput-object p2, p0, LH/h$b$b;->D:LS0/X;

    iput-object p3, p0, LH/h$b$b;->E:LN/F;

    iput-object p4, p0, LH/h$b$b;->F:LS0/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, LH/h$b$b;->b(ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(ZLm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    if-eqz p1, :cond_0

    iget-object p1, p0, LH/h$b$b;->C:LH/w;

    invoke-virtual {p1}, LH/w;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LH/h$b$b;->D:LS0/X;

    iget-object p2, p0, LH/h$b$b;->C:LH/w;

    iget-object v0, p0, LH/h$b$b;->E:LN/F;

    invoke-virtual {v0}, LN/F;->O()LS0/V;

    move-result-object v0

    iget-object v1, p0, LH/h$b$b;->F:LS0/s;

    iget-object v2, p0, LH/h$b$b;->E:LN/F;

    invoke-virtual {v2}, LN/F;->J()LS0/L;

    move-result-object v2

    invoke-static {p1, p2, v0, v1, v2}, LH/h;->k(LS0/X;LH/w;LS0/V;LS0/s;LS0/L;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LH/h$b$b;->C:LH/w;

    invoke-static {p1}, LH/h;->i(LH/w;)V

    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
