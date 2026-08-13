.class public final LP1/g;
.super Landroidx/datastore/preferences/protobuf/w;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/P;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP1/g$a;
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:LP1/g;

.field private static volatile PARSER:Landroidx/datastore/preferences/protobuf/X; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/X;"
        }
    .end annotation
.end field

.field public static final STRINGS_FIELD_NUMBER:I = 0x1


# instance fields
.field private strings_:Landroidx/datastore/preferences/protobuf/y$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/y$b;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LP1/g;

    invoke-direct {v0}, LP1/g;-><init>()V

    sput-object v0, LP1/g;->DEFAULT_INSTANCE:LP1/g;

    const-class v1, LP1/g;

    invoke-static {v1, v0}, Landroidx/datastore/preferences/protobuf/w;->K(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/w;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/w;-><init>()V

    invoke-static {}, Landroidx/datastore/preferences/protobuf/w;->s()Landroidx/datastore/preferences/protobuf/y$b;

    move-result-object v0

    iput-object v0, p0, LP1/g;->strings_:Landroidx/datastore/preferences/protobuf/y$b;

    return-void
.end method

.method static synthetic N()LP1/g;
    .locals 1

    sget-object v0, LP1/g;->DEFAULT_INSTANCE:LP1/g;

    return-object v0
.end method

.method static synthetic O(LP1/g;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, LP1/g;->P(Ljava/lang/Iterable;)V

    return-void
.end method

.method private P(Ljava/lang/Iterable;)V
    .locals 1

    invoke-direct {p0}, LP1/g;->Q()V

    iget-object v0, p0, LP1/g;->strings_:Landroidx/datastore/preferences/protobuf/y$b;

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/a;->e(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private Q()V
    .locals 2

    .prologue
    iget-object v0, p0, LP1/g;->strings_:Landroidx/datastore/preferences/protobuf/y$b;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/y$b;->I()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/w;->E(Landroidx/datastore/preferences/protobuf/y$b;)Landroidx/datastore/preferences/protobuf/y$b;

    move-result-object v0

    iput-object v0, p0, LP1/g;->strings_:Landroidx/datastore/preferences/protobuf/y$b;

    :cond_0
    return-void
.end method

.method public static S()LP1/g;
    .locals 1

    sget-object v0, LP1/g;->DEFAULT_INSTANCE:LP1/g;

    return-object v0
.end method

.method public static U()LP1/g$a;
    .locals 1

    sget-object v0, LP1/g;->DEFAULT_INSTANCE:LP1/g;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->o()Landroidx/datastore/preferences/protobuf/w$a;

    move-result-object v0

    check-cast v0, LP1/g$a;

    return-object v0
.end method


# virtual methods
.method public T()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LP1/g;->strings_:Landroidx/datastore/preferences/protobuf/y$b;

    return-object v0
.end method

.method protected final r(Landroidx/datastore/preferences/protobuf/w$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    sget-object p1, LP1/g;->PARSER:Landroidx/datastore/preferences/protobuf/X;

    if-nez p1, :cond_1

    const-class p2, LP1/g;

    monitor-enter p2

    :try_start_0
    sget-object p1, LP1/g;->PARSER:Landroidx/datastore/preferences/protobuf/X;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/datastore/preferences/protobuf/w$b;

    sget-object p3, LP1/g;->DEFAULT_INSTANCE:LP1/g;

    invoke-direct {p1, p3}, Landroidx/datastore/preferences/protobuf/w$b;-><init>(Landroidx/datastore/preferences/protobuf/w;)V

    sput-object p1, LP1/g;->PARSER:Landroidx/datastore/preferences/protobuf/X;

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
    sget-object p1, LP1/g;->DEFAULT_INSTANCE:LP1/g;

    return-object p1

    :pswitch_4
    new-array p1, p2, [Ljava/lang/Object;

    const-string p2, "strings_"

    const/4 p3, 0x0

    aput-object p2, p1, p3

    const-string p2, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"

    sget-object p3, LP1/g;->DEFAULT_INSTANCE:LP1/g;

    invoke-static {p3, p2, p1}, Landroidx/datastore/preferences/protobuf/w;->G(Landroidx/datastore/preferences/protobuf/O;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, LP1/g$a;

    invoke-direct {p1, p3}, LP1/g$a;-><init>(LP1/e;)V

    return-object p1

    :pswitch_6
    new-instance p1, LP1/g;

    invoke-direct {p1}, LP1/g;-><init>()V

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
