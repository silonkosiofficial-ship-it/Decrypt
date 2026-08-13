.class final LN0/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN0/Y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN0/Y;

    invoke-direct {v0}, LN0/Y;-><init>()V

    sput-object v0, LN0/Y;->a:LN0/Y;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/text/StaticLayout$Builder;Z)V
    .locals 0

    invoke-static {p0, p1}, LN0/X;->a(Landroid/text/StaticLayout$Builder;Z)Landroid/text/StaticLayout$Builder;

    return-void
.end method
