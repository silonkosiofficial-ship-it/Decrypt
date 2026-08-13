.class final LM0/B$t;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM0/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LM0/B$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM0/B$t;

    invoke-direct {v0}, LM0/B$t;-><init>()V

    sput-object v0, LM0/B$t;->D:LM0/B$t;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LT0/g;
    .locals 2

    new-instance v0, LT0/g;

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, LT0/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LM0/B$t;->a(Ljava/lang/Object;)LT0/g;

    move-result-object p1

    return-object p1
.end method
