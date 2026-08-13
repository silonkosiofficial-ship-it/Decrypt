.class public final LO0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO0/a;

    invoke-direct {v0}, LO0/a;-><init>()V

    sput-object v0, LO0/a;->a:LO0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LO0/f;)Landroid/text/SegmentFinder;
    .locals 1

    new-instance v0, LO0/a$a;

    invoke-direct {v0, p1}, LO0/a$a;-><init>(LO0/f;)V

    invoke-static {v0}, LN0/c;->a(Ljava/lang/Object;)Landroid/text/SegmentFinder;

    move-result-object p1

    return-object p1
.end method
