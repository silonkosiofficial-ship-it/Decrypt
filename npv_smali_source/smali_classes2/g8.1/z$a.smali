.class public final Lg8/z$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lg8/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/z$a;

    invoke-direct {v0}, Lg8/z$a;-><init>()V

    sput-object v0, Lg8/z$a;->a:Lg8/z$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
