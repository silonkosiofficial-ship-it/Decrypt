.class public final LX7/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX7/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LX7/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/q$a;

    invoke-direct {v0}, LX7/q$a;-><init>()V

    sput-object v0, LX7/q$a;->a:LX7/q$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LZ7/c;)V
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
