.class public Lb5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV4/b;


# static fields
.field private static final a:Lb5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb5/b;

    invoke-direct {v0}, Lb5/b;-><init>()V

    sput-object v0, Lb5/b;->a:Lb5/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lb5/b;
    .locals 1

    sget-object v0, Lb5/b;->a:Lb5/b;

    return-object v0
.end method


# virtual methods
.method public a(LQ4/f;)LV4/a;
    .locals 1

    const-class v0, Lc5/i;

    invoke-virtual {p1, v0}, LQ4/f;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LV4/a;

    return-object p1
.end method
