.class public final LQ1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ1/j$a;
    }
.end annotation


# static fields
.field public static final a:LQ1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ1/j;

    invoke-direct {v0}, LQ1/j;-><init>()V

    sput-object v0, LQ1/j;->a:LQ1/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(Ljava/lang/String;LP1/h;LQ1/c;)V
    .locals 3

    .prologue
    invoke-virtual {p2}, LP1/h;->g0()LP1/h$b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, LQ1/j$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :pswitch_1
    new-instance p1, LM1/c;

    const-string p2, "Value not set."

    invoke-direct {p1, p2, v2, v1, v2}, LM1/c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILy7/k;)V

    throw p1

    :pswitch_2
    invoke-static {p1}, LQ1/h;->b(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->Y()Landroidx/datastore/preferences/protobuf/g;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/g;->P()[B

    move-result-object p2

    const-string v0, "value.bytes.toByteArray()"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_3
    invoke-static {p1}, LQ1/h;->h(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->f0()LP1/g;

    move-result-object p2

    invoke-virtual {p2}, LP1/g;->T()Ljava/util/List;

    move-result-object p2

    const-string v0, "value.stringSet.stringsList"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    invoke-static {p1}, LQ1/h;->g(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->e0()Ljava/lang/String;

    move-result-object p2

    const-string v0, "value.string"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    invoke-static {p1}, LQ1/h;->f(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->d0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, LQ1/h;->e(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->c0()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    invoke-static {p1}, LQ1/h;->c(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->a0()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_8
    invoke-static {p1}, LQ1/h;->d(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->b0()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_9
    invoke-static {p1}, LQ1/h;->a(Ljava/lang/String;)LQ1/f$a;

    move-result-object p1

    invoke-virtual {p2}, LP1/h;->X()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    :goto_1
    return-void

    :pswitch_a
    new-instance p1, LM1/c;

    const-string p2, "Value case is null."

    invoke-direct {p1, p2, v2, v1, v2}, LM1/c;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILy7/k;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private final f(Ljava/lang/Object;)LP1/h;
    .locals 3

    .prologue
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, LP1/h$a;->u(Z)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setBoolean(value).build()"

    :goto_0
    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LP1/h;

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_1

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, LP1/h$a;->x(F)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setFloat(value).build()"

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_2

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LP1/h$a;->w(D)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setDouble(value).build()"

    goto :goto_0

    :cond_2
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, LP1/h$a;->y(I)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setInteger(value).build()"

    goto :goto_0

    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LP1/h$a;->z(J)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setLong(value).build()"

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, LP1/h$a;->A(Ljava/lang/String;)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setString(value).build()"

    goto :goto_0

    :cond_5
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_6

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    invoke-static {}, LP1/g;->U()LP1/g$a;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>"

    invoke-static {p1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {v1, p1}, LP1/g$a;->u(Ljava/lang/Iterable;)LP1/g$a;

    move-result-object p1

    invoke-virtual {v0, p1}, LP1/h$a;->B(LP1/g$a;)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setStringSe\u2026                ).build()"

    goto/16 :goto_0

    :cond_6
    instance-of v0, p1, [B

    if-eqz v0, :cond_7

    invoke-static {}, LP1/h;->h0()LP1/h$a;

    move-result-object v0

    check-cast p1, [B

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/g;->n([B)Landroidx/datastore/preferences/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LP1/h$a;->v(Landroidx/datastore/preferences/protobuf/g;)LP1/h$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    const-string v0, "newBuilder().setBytes(By\u2026.copyFrom(value)).build()"

    goto/16 :goto_0

    :goto_1
    return-object p1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PreferencesSerializer does not support type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ1/j;->e()LQ1/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;LX9/e;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ1/f;

    invoke-virtual {p0, p1, p2, p3}, LQ1/j;->g(LQ1/f;LX9/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(LX9/f;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    sget-object p2, LP1/d;->a:LP1/d$a;

    invoke-interface {p1}, LX9/f;->r1()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p2, p1}, LP1/d$a;->a(Ljava/io/InputStream;)LP1/f;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [LQ1/f$b;

    invoke-static {p2}, LQ1/g;->b([LQ1/f$b;)LQ1/c;

    move-result-object p2

    invoke-virtual {p1}, LP1/f;->Q()Ljava/util/Map;

    move-result-object p1

    const-string v0, "preferencesProto.preferencesMap"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP1/h;

    sget-object v2, LQ1/j;->a:LQ1/j;

    const-string v3, "name"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "value"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1, v0, p2}, LQ1/j;->d(Ljava/lang/String;LP1/h;LQ1/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LQ1/f;->d()LQ1/f;

    move-result-object p1

    return-object p1
.end method

.method public e()LQ1/f;
    .locals 1

    invoke-static {}, LQ1/g;->a()LQ1/f;

    move-result-object v0

    return-object v0
.end method

.method public g(LQ1/f;LX9/e;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p1}, LQ1/f;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {}, LP1/f;->U()LP1/f$a;

    move-result-object p3

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ1/f$a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1}, LQ1/f$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0}, LQ1/j;->f(Ljava/lang/Object;)LP1/h;

    move-result-object v0

    invoke-virtual {p3, v1, v0}, LP1/f$a;->u(Ljava/lang/String;LP1/h;)LP1/f$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroidx/datastore/preferences/protobuf/w$a;->k()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p1

    check-cast p1, LP1/f;

    invoke-interface {p2}, LX9/e;->p1()Ljava/io/OutputStream;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/a;->h(Ljava/io/OutputStream;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
