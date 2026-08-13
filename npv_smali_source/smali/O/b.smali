.class public final LO/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO/b$a;
    }
.end annotation


# static fields
.field public static final a:LO/b;

.field private static final b:LO/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO/b;

    invoke-direct {v0}, LO/b;-><init>()V

    sput-object v0, LO/b;->a:LO/b;

    sget-object v0, LO/b$a;->a:LO/b$a;

    sput-object v0, LO/b;->b:LO/b$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LO/b$a;
    .locals 1

    sget-object v0, LO/b;->b:LO/b$a;

    return-object v0
.end method
