.class final LM0/B$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


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
        LM0/B$f$a;
    }
.end annotation


# static fields
.field public static final D:LM0/B$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$f;

    invoke-direct {v0}, LM0/B$f;-><init>()V

    sput-object v0, LM0/B$f;->D:LM0/B$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LM0/d$c;
    .locals 6

    .prologue
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, LM0/f;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    check-cast v2, Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Ljava/lang/Integer;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v4, 0x4

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    check-cast v4, Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v4, v1

    :goto_3
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v5, LM0/B$f$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :pswitch_0
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    :cond_4
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LM0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_1
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LM0/B;->d()Le0/j;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    instance-of v5, v0, LM0/n;

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    if-eqz p1, :cond_6

    invoke-interface {v0, p1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LM0/h$a;

    :cond_6
    :goto_4
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LM0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_2
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LM0/B;->e()Le0/j;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    instance-of v5, v0, LM0/n;

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    if-eqz p1, :cond_8

    invoke-interface {v0, p1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LM0/h$b;

    :cond_8
    :goto_5
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LM0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_3
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LM0/B;->f()Le0/j;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    instance-of v5, v0, LM0/n;

    if-nez v5, :cond_9

    goto :goto_6

    :cond_9
    if-eqz p1, :cond_a

    invoke-interface {v0, p1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LM0/T;

    :cond_a
    :goto_6
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LM0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto/16 :goto_a

    :pswitch_4
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LM0/B;->g()Le0/j;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    instance-of v5, v0, LM0/n;

    if-nez v5, :cond_b

    goto :goto_7

    :cond_b
    if-eqz p1, :cond_c

    invoke-interface {v0, p1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LM0/U;

    :cond_c
    :goto_7
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LM0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto :goto_a

    :pswitch_5
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LM0/B;->v()Le0/j;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    instance-of v5, v0, LM0/n;

    if-nez v5, :cond_d

    goto :goto_8

    :cond_d
    if-eqz p1, :cond_e

    invoke-interface {v0, p1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LM0/C;

    :cond_e
    :goto_8
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LM0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    goto :goto_a

    :pswitch_6
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LM0/B;->i()Le0/j;

    move-result-object v0

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    instance-of v5, v0, LM0/n;

    if-nez v5, :cond_f

    goto :goto_9

    :cond_f
    if-eqz p1, :cond_10

    invoke-interface {v0, p1}, Le0/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LM0/v;

    :cond_10
    :goto_9
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p1, LM0/d$c;

    invoke-direct {p1, v1, v2, v3, v4}, LM0/d$c;-><init>(Ljava/lang/Object;IILjava/lang/String;)V

    :goto_a
    return-object p1

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

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0/B$f;->a(Ljava/lang/Object;)LM0/d$c;

    move-result-object p1

    return-object p1
.end method
