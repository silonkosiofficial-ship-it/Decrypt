.class public final LP1/f;
.super Landroidx/datastore/preferences/protobuf/w;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/P;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP1/f$a;,
        LP1/f$b;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LP1/f;

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/X; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/X;"
        }
    .end annotation
.end field

.field public static final PREFERENCES_FIELD_NUMBER:I = 0x1


# instance fields
.field private preferences_:Landroidx/datastore/preferences/protobuf/I;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/I;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LP1/f;

    invoke-direct {v0}, LP1/f;-><init>()V

    sput-object v0, LP1/f;->DEFAULT_INSTANCE:LP1/f;

    const-class v1, LP1/f;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/w;->K(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/w;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/w;-><init>()V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/I;->d()Landroidx/datastore/preferences/protobuf/I;

    move-result-object v0

    iput-object v0, p0, LP1/f;->preferences_:Landroidx/datastore/preferences/protobuf/I;

    return-void
.end method

.method static synthetic N()LP1/f;
    .locals 1

    sget-object v0, LP1/f;->DEFAULT_INSTANCE:LP1/f;

    return-object v0
.end method

.method static synthetic O(LP1/f;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, LP1/f;->P()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private P()Ljava/util/Map;
    .locals 1

    invoke-direct {p0}, LP1/f;->S()Landroidx/datastore/preferences/protobuf/I;

    move-result-object v0

    return-object v0
.end method

.method private S()Landroidx/datastore/preferences/protobuf/I;
    .locals 1

    .prologue
    iget-object v0, p0, LP1/f;->preferences_:Landroidx/datastore/preferences/protobuf/I;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/I;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LP1/f;->preferences_:Landroidx/datastore/preferences/protobuf/I;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/I;->p()Landroidx/datastore/preferences/protobuf/I;

    move-result-object v0

    iput-object v0, p0, LP1/f;->preferences_:Landroidx/datastore/preferences/protobuf/I;

    :cond_0
    iget-object v0, p0, LP1/f;->preferences_:Landroidx/datastore/preferences/protobuf/I;

    return-object v0
.end method

.method private T()Landroidx/datastore/preferences/protobuf/I;
    .locals 1

    iget-object v0, p0, LP1/f;->preferences_:Landroidx/datastore/preferences/protobuf/I;

    return-object v0
.end method

.method public static U()LP1/f$a;
    .locals 1

    sget-object v0, LP1/f;->DEFAULT_INSTANCE:LP1/f;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->o()Landroidx/datastore/preferences/protobuf/w$a;

    move-result-object v0

    check-cast v0, LP1/f$a;

    return-object v0
.end method

.method public static V(Ljava/io/InputStream;)LP1/f;
    .locals 1

    sget-object v0, LP1/f;->DEFAULT_INSTANCE:LP1/f;

    invoke-static {v0, p0}, Landroidx/datastore/preferences/protobuf/w;->I(Landroidx/datastore/preferences/protobuf/w;Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/w;

    move-result-object p0

    check-cast p0, LP1/f;

    return-object p0
.end method


# virtual methods
.method public Q()Ljava/util/Map;
    .locals 1

    invoke-direct {p0}, LP1/f;->T()Landroidx/datastore/preferences/protobuf/I;

    move-result-object v0

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected final r(Landroidx/datastore/preferences/protobuf/w$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    const/4 p2, 0x1

    sget-object p3, LP1/e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, LP1/f;->PARSER:Landroidx/datastore/preferences/protobuf/X;

    if-nez p1, :cond_1

    const-class p2, LP1/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, LP1/f;->PARSER:Landroidx/datastore/preferences/protobuf/X;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/w$b;

    sget-object p3, LP1/f;->DEFAULT_INSTANCE:LP1/f;

    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/w$b;-><init>(Landroidx/datastore/preferences/protobuf/w;)V

    sput-object p1, LP1/f;->PARSER:Landroidx/datastore/preferences/protobuf/X;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    return-object p1

    :pswitch_3
    sget-object p1, LP1/f;->DEFAULT_INSTANCE:LP1/f;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const-string p3, "preferences_"

    const/4 v0, 0x0

    aput-object p3, p1, v0

    sget-object p3, LP1/f$b;->a:Landroidx/datastore/preferences/protobuf/H;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object p3, LP1/f;->DEFAULT_INSTANCE:LP1/f;

    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/w;->G(Landroidx/datastore/preferences/protobuf/O;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LP1/f$a;

    invoke-direct {p1, p3}, LP1/f$a;-><init>(LP1/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, LP1/f;

    invoke-direct {p1}, LP1/f;-><init>()V

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
