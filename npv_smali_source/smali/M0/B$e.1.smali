.class final LM0/B$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM0/B$e$a;
    }
.end annotation


# static fields
.field public static final D:LM0/B$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$e;

    invoke-direct {v0}, LM0/B$e;-><init>()V

    sput-object v0, LM0/B$e;->D:LM0/B$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le0/l;LM0/d$c;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LM0/v;

    if-eqz v1, :cond_0

    sget-object v0, LM0/f;->C:LM0/f;

    goto :goto_0

    :cond_0
    instance-of v1, v0, LM0/C;

    if-eqz v1, :cond_1

    sget-object v0, LM0/f;->D:LM0/f;

    goto :goto_0

    :cond_1
    instance-of v1, v0, LM0/U;

    if-eqz v1, :cond_2

    sget-object v0, LM0/f;->E:LM0/f;

    goto :goto_0

    :cond_2
    instance-of v1, v0, LM0/T;

    if-eqz v1, :cond_3

    sget-object v0, LM0/f;->F:LM0/f;

    goto :goto_0

    :cond_3
    instance-of v1, v0, LM0/h$b;

    if-eqz v1, :cond_4

    sget-object v0, LM0/f;->G:LM0/f;

    goto :goto_0

    :cond_4
    instance-of v0, v0, LM0/h$a;

    if-eqz v0, :cond_5

    sget-object v0, LM0/f;->H:LM0/f;

    goto :goto_0

    :cond_5
    sget-object v0, LM0/f;->I:LM0/f;

    :goto_0
    sget-object v1, LM0/B$e$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_1
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LM0/h$a;

    invoke-static {}, LM0/B;->d()Le0/j;

    move-result-object v2

    :goto_1
    invoke-static {v1, v2, p1}, LM0/B;->y(Ljava/lang/Object;Le0/j;Le0/l;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :pswitch_2
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LM0/h$b;

    invoke-static {}, LM0/B;->e()Le0/j;

    move-result-object v2

    goto :goto_1

    :pswitch_3
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LM0/T;

    invoke-static {}, LM0/B;->f()Le0/j;

    move-result-object v2

    goto :goto_1

    :pswitch_4
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LM0/U;

    invoke-static {}, LM0/B;->g()Le0/j;

    move-result-object v2

    goto :goto_1

    :pswitch_5
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LM0/C;

    invoke-static {}, LM0/B;->v()Le0/j;

    move-result-object v2

    goto :goto_1

    :pswitch_6
    invoke-virtual {p2}, LM0/d$c;->e()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LM0/v;

    invoke-static {}, LM0/B;->i()Le0/j;

    move-result-object v2

    goto :goto_1

    :goto_2
    invoke-static {v0}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LM0/d$c;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, LM0/d$c;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2}, LM0/d$c;->g()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, LM0/B;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object p1, v3, v0

    const/4 p1, 0x2

    aput-object v1, v3, p1

    const/4 p1, 0x3

    aput-object v2, v3, p1

    const/4 p1, 0x4

    aput-object p2, v3, p1

    invoke-static {v3}, Lj7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le0/l;

    check-cast p2, LM0/d$c;

    invoke-virtual {p0, p1, p2}, LM0/B$e;->a(Le0/l;LM0/d$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
