.class Lv8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/b$c;


# static fields
.field public static final a:Lv8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv8/a;

    invoke-direct {v0}, Lv8/a;-><init>()V

    sput-object v0, Lv8/a;->a:Lv8/a;

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

    check-cast p1, LO7/j0;

    invoke-static {p1}, Lv8/c;->a(LO7/j0;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
