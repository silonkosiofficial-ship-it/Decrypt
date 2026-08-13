.class LN4/l;
.super LN4/s;
.source "SourceFile"


# static fields
.field static final F:LN4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/l;

    invoke-direct {v0}, LN4/l;-><init>()V

    sput-object v0, LN4/l;->F:LN4/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-static {}, LN4/p;->f()LN4/p;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, LN4/s;-><init>(LN4/p;ILjava/util/Comparator;)V

    return-void
.end method
