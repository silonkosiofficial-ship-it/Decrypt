.class final LN0/W;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN0/W;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN0/W;

    invoke-direct {v0}, LN0/W;-><init>()V

    sput-object v0, LN0/W;->a:LN0/W;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/text/StaticLayout$Builder;I)V
    .locals 0

    invoke-static {p0, p1}, LN0/V;->a(Landroid/text/StaticLayout$Builder;I)Landroid/text/StaticLayout$Builder;

    return-void
.end method
