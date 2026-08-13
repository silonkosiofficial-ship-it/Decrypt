.class public final Lg8/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lg8/h;

.field private final b:Lg8/j;


# direct methods
.method public constructor <init>(Lg8/h;Lg8/j;)V
    .locals 1

    const-string v0, "deserializationComponentsForJava"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/h$a$a;->a:Lg8/h;

    iput-object p2, p0, Lg8/h$a$a;->b:Lg8/j;

    return-void
.end method


# virtual methods
.method public final a()Lg8/h;
    .locals 1

    iget-object v0, p0, Lg8/h$a$a;->a:Lg8/h;

    return-object v0
.end method

.method public final b()Lg8/j;
    .locals 1

    iget-object v0, p0, Lg8/h$a$a;->b:Lg8/j;

    return-object v0
.end method
