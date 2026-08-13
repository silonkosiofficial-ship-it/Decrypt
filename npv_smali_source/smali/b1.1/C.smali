.class public final Lb1/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/C$a;
    }
.end annotation


# static fields
.field public static final b:Lb1/C$a;

.field private static final c:Lb1/C;

.field private static final d:Lb1/C;

.field private static final e:Lb1/C;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb1/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb1/C$a;-><init>(Ly7/k;)V

    sput-object v0, Lb1/C;->b:Lb1/C$a;

    new-instance v0, Lb1/C;

    const-string v1, "visible"

    invoke-direct {v0, v1}, Lb1/C;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb1/C;->c:Lb1/C;

    new-instance v0, Lb1/C;

    const-string v1, "invisible"

    invoke-direct {v0, v1}, Lb1/C;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb1/C;->d:Lb1/C;

    new-instance v0, Lb1/C;

    const-string v1, "gone"

    invoke-direct {v0, v1}, Lb1/C;-><init>(Ljava/lang/String;)V

    sput-object v0, Lb1/C;->e:Lb1/C;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/C;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()Lb1/C;
    .locals 1

    sget-object v0, Lb1/C;->c:Lb1/C;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb1/C;->a:Ljava/lang/String;

    return-object v0
.end method
