.class LN7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/b$c;


# static fields
.field public static final a:LN7/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN7/g;

    invoke-direct {v0}, LN7/g;-><init>()V

    sput-object v0, LN7/g;->a:LN7/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, LO7/b;

    invoke-static {p1}, LN7/i;->i(LO7/b;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
