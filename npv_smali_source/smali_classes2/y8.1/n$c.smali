.class final Ly8/n$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/n;->b(Ln8/f;LW7/b;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Ly8/n$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/n$c;

    invoke-direct {v0}, Ly8/n$c;-><init>()V

    sput-object v0, Ly8/n$c;->D:Ly8/n$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/Z;)LO7/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/Z;

    invoke-virtual {p0, p1}, Ly8/n$c;->a(LO7/Z;)LO7/a;

    move-result-object p1

    return-object p1
.end method
