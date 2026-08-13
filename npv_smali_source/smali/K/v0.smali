.class public final LK/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK/v0;

    invoke-direct {v0}, LK/v0;-><init>()V

    sput-object v0, LK/v0;->a:LK/v0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;LT0/h;)V
    .locals 2

    .prologue
    sget-object v0, LT0/h;->E:LT0/h$a;

    invoke-virtual {v0}, LT0/h$a;->b()LT0/h;

    move-result-object v0

    invoke-static {p2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, LK/u0;->a(Landroid/view/inputmethod/EditorInfo;Landroid/os/LocaleList;)V

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT0/g;

    invoke-virtual {v1}, LT0/g;->b()Ljava/util/Locale;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    new-array p2, p2, [Ljava/util/Locale;

    invoke-interface {v0, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/util/Locale;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/util/Locale;

    invoke-static {p2}, LK/t0;->a([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object p2

    goto :goto_0

    :goto_2
    return-void
.end method
