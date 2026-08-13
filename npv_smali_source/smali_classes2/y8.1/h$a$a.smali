.class final Ly8/h$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Ly8/h$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/h$a$a;

    invoke-direct {v0}, Ly8/h$a$a;-><init>()V

    sput-object v0, Ly8/h$a$a;->D:Ly8/h$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, Ly8/h$a$a;->a(Ln8/f;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
